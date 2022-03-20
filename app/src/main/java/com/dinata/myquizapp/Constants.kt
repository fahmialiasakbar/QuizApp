package com.dinata.myquizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val questionText = "What country does this flag belong to?"
        val que1 = Question(
            1,
            questionText,
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Moldova",
            "Uruguay",
            "Romania",
            1
        )

        questionList.add(que1)
        return questionList
    }
}