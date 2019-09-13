package com.rybarstudios.ageofempiressprint.model

import com.google.gson.annotations.SerializedName

data class UniqueTech(val name: String)

data class UniqueTechList(@SerializedName("unique_tech") val uniqueTech: UniqueTech)

data class UniqueUnit(val name: String)

data class UniqueUnitList(@SerializedName("unique_unit") val uniqueTech: UniqueUnit)

data class TeamBonus(val name: String)

data class TeamBonusList(@SerializedName("team_bonus") val teamBonus: TeamBonus)

data class Civilization(
    val id: Int,
    val name: String,
    val expansion: String,
    val armyType: String,
    val uniqueUnit: List<UniqueUnitList>,
    val uniqueTech: List<UniqueTechList>,
    val teamBonus: List<TeamBonusList>,
    var isFavorite: Boolean = false
)