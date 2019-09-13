package com.rybarstudios.ageofempiressprint.model

abstract class Empire(val name: String, val expansion: String, var isFavorite: Boolean = false) {
    abstract fun getDescription(): String
}

class Civilization(name: String, expansion: String, val armyType: String, isFavorite: Boolean = false)
    : Empire(name, expansion, isFavorite) {

    override fun getDescription(): String {
        return """
            Name: $name
            Expansion: $expansion
            Army Type: $armyType
        """.trimIndent()
    }
}

class Units(name: String, val unitDescription: String, expansion: String, val age: String, isFavorite: Boolean = false)
    : Empire(name, expansion, isFavorite) {
    override fun getDescription(): String {
        return """
            Name: $name
            Description: $unitDescription
            Expansion: $expansion
            Age: $age
        """.trimIndent()
    }
}

class Structure(name: String,  expansion: String, val age: String, isFavorite: Boolean = false)
    : Empire(name, expansion, isFavorite) {
    override fun getDescription(): String {
        return """
            Name: $name
            Expansion: $expansion
            Age: $age
        """.trimIndent()
    }
}

class Technology(name: String, val techDescription: String, expansion: String, val age: String, isFavorite: Boolean = false)
    : Empire(name, expansion, isFavorite) {
    override fun getDescription(): String {
        return """
            Name: $name
            Description: $techDescription
            Expansion: $expansion
            Age: $age
        """.trimIndent()
    }
}