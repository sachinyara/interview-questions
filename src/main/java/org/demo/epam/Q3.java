package org.demo.epam;

import java.util.Optional;

public class Q3 {

    public static void main(String[] args) {
       new Q3().test(null);
    }

    public void test(Object student) throws RuntimeException {
        Optional.ofNullable(student).orElseThrow(RuntimeException::new);
        callStudentDetails(student);


    }

    //no modification required
    private void callStudentDetails (Object student) {
        //business logic
        System.out.println("call student method is called");
    }

}
