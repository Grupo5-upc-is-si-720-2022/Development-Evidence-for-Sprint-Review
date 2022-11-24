package pe.edu.dps.Exercise;

import java.util.List;

public class ListExercise {
    private List<Exercise> exerciseR;
    private List<Exercise> exerciseF;

    public List<Exercise> getExerciseF() {
        return exerciseF;
    }

    public List<Exercise> getExerciseR() {
        return exerciseR;
    }
    public int getAmountExerciseR(){
        return exerciseR.size();
    }
    public int getAmountExerciseF(){
        return exerciseF.size();
    }
}
