package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        // TODO
        //  FIX ME!!!
        val parts: List<String>? = fullName?.split(" ")

        val firstName: String? = parts?.getOrNull(0)
        val lastName: String? = parts?.getOrNull(1)

        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
//        TODO NICK GENER
        return " "
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return null
    }
}