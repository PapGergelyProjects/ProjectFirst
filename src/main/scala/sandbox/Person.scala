package sandbox

class Person(name: String, age: Int, weigth: Double) {
    var personName = name
    var personAge = age
    var personWeight = weigth

    def showParams(): String = {
      return personName + personAge + personWeight
    }
}
