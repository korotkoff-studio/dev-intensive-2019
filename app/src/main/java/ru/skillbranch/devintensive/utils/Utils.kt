package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>?
        if (fullName?.trim() == "") {
            parts = null
        } else {
            parts = fullName?.split(" ")
        }
        val firstName: String?
        val lastName: String?
        when {
            parts.isNullOrEmpty() -> {
                firstName = null
                lastName = null
            }
            parts.size == 1 -> {
                firstName = parts[0]
                lastName = null
            }
            else -> {
                firstName = parts[0]
                lastName = parts[1]
            }
        }
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