package com.example.springbootdependencyinjectiontypes.setter.withcollections;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question {

    private int questionNumber;
    private String quest;
    private List<String> answers;
    private Map<String,String> answersWithNumbers;

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Map<String, String> getAnswersWithNumbers() {
        return answersWithNumbers;
    }

    public void setAnswersWithNumbers(Map<String, String> answersWithNumbers) {
        this.answersWithNumbers = answersWithNumbers;
    }

    public void values(){
        System.out.println(questionNumber+" "+quest);
        System.out.println("answers are:");
        Iterator<String> itr=answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public void mapValues(){
        Set<Map.Entry<String, String>> set=answersWithNumbers.entrySet();
        Iterator<Entry<String, String>> entryIterator=set.iterator();
        while(entryIterator.hasNext()){
            Entry<String,String> entry=entryIterator.next();
            System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
        }
    }
}

