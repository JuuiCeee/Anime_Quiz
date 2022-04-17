package com.example.myquizapp

import androidx.core.graphics.drawable.toDrawable

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Что это за аниме?", R.drawable.ic_anime_killer_class,
            "Кошечка из Сакурасо",
            "Класс убийц",
            "Код Гиасс: Восстание Лелуша",
            "Клинок, рассекающий демонов",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Что это за аниме?", R.drawable.ic_anime_basket,
            "Баскетбол Куроко",
            "Бездомный Бог",
            "Берсерк ТВ-1",
            "Крошка Мемоль",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Что это за аниме?", R.drawable.ic_anime_town,
            "Гуррен-Лаганн",
            "Город, в котором меня нет",
            "Живая любовь!",
            "Унесенные волками",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Что это за аниме?", R.drawable.ic_anime_stone,
            "Класс убийц",
            "Дороро",
            "Клинок, рассекающий демонов",
            "Доктор Стоун",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Что это за аниме?", R.drawable.ic_anime_akame,
            "Убийца Акамэ!",
            "Шарлотта",
            "Демоны старшей школы",
            "Токийский Гуль",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Что это за аниме?", R.drawable.ic_anime_welcome_to,
            "Класс убийц",
            "Дороро",
            "Доктор Стоун",
            "Класс превосходства",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Что это за аниме?", R.drawable.ic_anime_masters,
            "Мастера Меча Онлайн",
            "Приключение ДжоДжо",
            "Необъятный океан",
            "Моб Психо 100",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Что это за аниме?", R.drawable.ic_anime_champlu,
            "Созданный в бездне",
            "Скитальцы",
            "Семь смертных грехов",
            "Самурай Чамплу",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Что это за аниме?", R.drawable.ic_anime_xz,
            "Несладкая жизнь Сайки Кусуо",
            "О моём перерождении в слизь",
            "Обещанный Неверленд",
            "Нет игры - нет жизни",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Что это за аниме?", R.drawable.ic_anime_parazit,
            "Президент - горничная!",
            "Пластиковые воспоминания",
            "Резонанс ужаса",
            "Паразит - Учение о жизни",
            4
        )
        questionsList.add(que10)
        return questionsList
    }
}