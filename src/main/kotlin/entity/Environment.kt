/*
 * Copyright (c) 2023. Smart Operating Block
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package entity

/**
 * The environment of the simulation.
 */
interface Environment {
    /**
     * The list of the nodes in the environment.
     */
    val nodes: List<Node>

    /**
     * The list of neighborhoods.
     */
    val neighborhoods: List<Neighborhood>

    /**
     * Maps node id to its position.
     */
    val nodeToPosition: HashMap<Int, Position>

    /**
     * Add a Node to the environment.
     * @param node the node to add.
     */
    fun addNode(node: Node)

    /**
     * Remove node from the environment.
     * @param node the node to remove
     */
    fun removeNode(node: Node)

    /**
     * Moves node in a new position.
     * @param node the node to move.
     * @param position the new position.
     */
    suspend fun moveNode(node: Node, position: Position)

    /**
     * @return the position of the node.
     */
    fun getNodePosition(node: Node): Position
}
