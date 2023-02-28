package com.mahrous.testkotlin.data

import com.google.gson.annotations.SerializedName

data class ArmorResponse(

    @field:SerializedName("AmorResponse")
    val amorResponse: List<AmorResponseItem?>? = null
)

data class SlotsItem(

    @field:SerializedName("rank")
    val rank: Int? = null
)

data class Item(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("carryLimit")
    val carryLimit: Int? = null,

    @field:SerializedName("value")
    val value: Int? = null,

    @field:SerializedName("rarity")
    val rarity: Int? = null
)

data class MaterialsItem(

    @field:SerializedName("item")
    val item: Item? = null,

    @field:SerializedName("quantity")
    val quantity: Int? = null
)

data class Assets(

    @field:SerializedName("imageFemale")
    val imageFemale: String? = null,

    @field:SerializedName("imageMale")
    val imageMale: String? = null
)

data class Modifiers(

    @field:SerializedName("health")
    val health: Int? = null,

    @field:SerializedName("attack")
    val attack: Int? = null,

    @field:SerializedName("affinity")
    val affinity: Int? = null,

    @field:SerializedName("resistFire")
    val resistFire: Int? = null,

    @field:SerializedName("resistWater")
    val resistWater: Int? = null,

    @field:SerializedName("defense")
    val defense: Int? = null,

    @field:SerializedName("damageWater")
    val damageWater: Int? = null,

    @field:SerializedName("resistIce")
    val resistIce: Int? = null,

    @field:SerializedName("damageThunder")
    val damageThunder: Int? = null,

    @field:SerializedName("resistThunder")
    val resistThunder: Int? = null,

    @field:SerializedName("sharpnessBonus")
    val sharpnessBonus: Int? = null,

    @field:SerializedName("damageFire")
    val damageFire: Int? = null,

    @field:SerializedName("damageDragon")
    val damageDragon: String? = null,

    @field:SerializedName("damageIce")
    val damageIce: Int? = null,

    @field:SerializedName("resistDragon")
    val resistDragon: Int? = null
)

data class SkillsItem(

    @field:SerializedName("skillName")
    val skillName: String? = null,

    @field:SerializedName("level")
    val level: Int? = null,

    @field:SerializedName("skill")
    val skill: Int? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("modifiers")
    val modifiers: Modifiers? = null
)

data class Defense(

    @field:SerializedName("max")
    val max: Int? = null,

    @field:SerializedName("augmented")
    val augmented: Int? = null,

    @field:SerializedName("base")
    val base: Int? = null
)

data class ArmorSet(

    @field:SerializedName("pieces")
    val pieces: List<Int?>? = null,

    @field:SerializedName("bonus")
    val bonus: Any? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("rank")
    val rank: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
)

data class Crafting(

    @field:SerializedName("materials")
    val materials: List<MaterialsItem?>? = null
)

data class AmorResponseItem(

    @field:SerializedName("resistances")
    val resistances: Resistances? = null,

    @field:SerializedName("armorSet")
    val armorSet: ArmorSet? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("skills")
    val skills: List<SkillsItem?>? = null,

    @field:SerializedName("slots")
    val slots: List<Any?>? = null,

    @field:SerializedName("assets")
    val assets: Assets? = null,

    @field:SerializedName("defense")
    val defense: Defense? = null,

    @field:SerializedName("crafting")
    val crafting: Crafting? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("rank")
    val rank: String? = null,

    @field:SerializedName("attributes")
    val attributes: Attributes? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("rarity")
    val rarity: Int? = null
)

data class Resistances(

    @field:SerializedName("fire")
    val fire: Int? = null,

    @field:SerializedName("ice")
    val ice: Int? = null,

    @field:SerializedName("thunder")
    val thunder: Int? = null,

    @field:SerializedName("dragon")
    val dragon: Int? = null,

    @field:SerializedName("water")
    val water: Int? = null
)

data class Attributes(

    @field:SerializedName("requiredGender")
    val requiredGender: String? = null
)
