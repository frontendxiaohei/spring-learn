package com.spring.test;

public class FTest {

    public interface AService{
        void sayHello();
    }

    public class AServiceImpl implements AService {
        @Override
        public void sayHello() {
            System.out.println("say hello");
        }
    }
}
