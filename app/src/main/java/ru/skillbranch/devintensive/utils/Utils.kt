package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>?
        if (fullName.isNullOrBlank()) {
            parts = null
        } else {
            parts = fullName.split(" ")
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
        fun firstLetterUpper(word: String): String {
            return word[0].toUpperCase().toString()
        }

        val initial1 = when {
            !firstName.isNullOrBlank() -> firstLetterUpper(firstName)
            else -> null
        }
        val initial2 = when {
            !lastName.isNullOrBlank() -> firstLetterUpper(lastName)
            else -> null
        }
        var initials = ""
        if (!initial1.isNullOrEmpty()) {
            initials += initial1
        }
        if (!initial2.isNullOrEmpty()) {
            initials += initial2
        }

        when (initials) {
            "" -> return null
            else -> return initials
        }
    }
}