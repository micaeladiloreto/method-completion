package org.wcci;

public class MethodTests {
    public String stringTimes(String str, int n) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        String myAnswer = "";

        for(int i=0; i<n; i++){
            myAnswer = myAnswer + str;
        }
        return myAnswer;
    }
}
