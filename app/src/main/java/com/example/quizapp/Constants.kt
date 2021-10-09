package com.example.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answer"




    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "what country does this flag belong to?", R.drawable.ic_bg,
            "Argentina",
            "Austria",
             "Armenia",
            "Austriya",
            1
        )

        questionsList.add(que1)

        val que2 = Question(1, "what country does this flag belong to?", R.drawable.ic_bg,
            "Argentina",
            "Austria",
            "Armenia",
            "Austriya",
            1
        )

        questionsList.add(que2)

        val que3 = Question(1, "what country does this flag belong to?", R.drawable.ic_bg,
            "Argentina",
            "Austria",
            "Armenia",
            "Austriya",
            1
        )

        questionsList.add(que3)
        val que4 = Question(1, "what country does this flag belong to?", R.drawable.ic_bg,
            "Argentina",
            "Austria",
            "Armenia",
            "Austriya",
            1
        )

        questionsList.add(que4)
        val que5 = Question(1, "what country does this flag belong to?", R.drawable.ic_bg,
            "Argentina",
            "Austria",
            "Armenia",
            "Austriya",
            1
        )

        questionsList.add(que5)

        return questionsList
    }
}