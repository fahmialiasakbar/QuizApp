package com.dinata.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val questionText = "What country does this flag belong to?"
        val que1 = Question(1, questionText, R.drawable.ic_flag_of_argentina,"Argentina","Moldova","Uruguay","Romania", 1)
        val que2 = Question(2, questionText, R.drawable.ic_flag_of_australia,"Australia","Fiji","New Zealand","Vanuatu", 1)
        val que3 = Question(3, questionText, R.drawable.ic_flag_of_belgium,"Croatia","Moldova","Germany","Belgium", 1)
        val que4 = Question(4, questionText, R.drawable.ic_flag_of_brazil,"Bolivia","Panama","Brazil","Armenia", 3)
        val que5 = Question(5, questionText, R.drawable.ic_flag_of_fiji,"Australia","Fiji","New Zealand","Vanuatu", 2)
        val que6 = Question(6, questionText, R.drawable.ic_flag_of_denmark,"Denmark","Austria","Swedi","Norway", 1)
        val que7 = Question(7, questionText, R.drawable.ic_flag_of_new_zealand,"Australia","Fiji","New Zealand","Vanuatu", 3)
        val que8 = Question(8, questionText, R.drawable.ic_flag_of_kuwait,"Jordan","Kuwait","Saudi","Palestine", 2)
        val que9 = Question(9, questionText, R.drawable.ic_flag_of_germany,"Croatia","Moldova","Germany","Belgium", 3)
        val que10 = Question(10, questionText, R.drawable.ic_flag_of_india,"India","Japan","Code d'Ivory","Italy", 1)


        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)
        return questionList
    }
}