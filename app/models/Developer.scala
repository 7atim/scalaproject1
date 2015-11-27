package models

case class Developer(id: Long, name: String, description: String)

object Developer {

  var developers = Set(
    Developer(11, "Hatim","web Dev"),
    Developer(12, "Bahaa","Python fanatic"),
    Developer(13, "Olivier","CEO"),
    Developer(15, "Mark","Facebook warrior"),
    Developer(16, "Ted","Java warrior")
  )

  def findAll = developers.toList.sortBy(_.id)

  def findById(id: Long) = developers.find(_.id == id)

  def add(developer: Developer) {
    developers = developers + developer
  }

  def remove(developer: Developer) {
    developers = developers - developer
  }
  
  /*
  def update(newDeveloper: Developer, oldDeveloper: Developer)
    developers = developers - oldDeveloper
    developers = developers + newDeveloper
  }
  */

}
