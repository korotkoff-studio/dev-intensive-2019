package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
import ru.skillbranch.devintensive.utils.Utils
import java.util.*


fun User.toUserView(): UserView {

    val nickName = Utils.transliteration("$firstName $lastName")
    val initials = Utils.toInitials(firstName, lastName)
    val status = "${if (lastVisit == null) "Ни разу не был" else if (isOnline) "онлайн" else "Последний раз был ${lastVisit.humanizeDiff()}"}"

    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        avatar = avatar,
        status = status,
        initials = initials)
}


fun Date.humanizeDiff(): String {
    // TODO Humanize
    return "какое-то время назад"
}