package me.devnatan.katan.core.database.jdbc.entity

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

internal object ServersTable : IntIdTable("katan_servers") {

    val name        = varchar("name", 255)
    val address     = varchar("address", 16)
    val port        = integer("port")
    val containerId = varchar("container_id", 255)
    val composition = varchar("composition", 255).default("default")

}

class ServerEntity(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<ServerEntity>(ServersTable)

    var name        by ServersTable.name
    var address     by ServersTable.address
    var port        by ServersTable.port
    var containerId by ServersTable.containerId
    val holders     by ServerHolderEntity referrersOn ServerHoldersTable.server
    val composition by ServersTable.composition

}