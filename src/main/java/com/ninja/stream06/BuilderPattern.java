package com.ninja.stream06;

import java.util.function.Consumer;

class Mailer {
    public Mailer from(String from) {
        System.out.println(from);
        return this;
    }
    public Mailer to(String to) {
        System.out.println(to);
        return this;
    }
    public Mailer subject(String subject) {
        System.out.println(subject);
        return this;
    }
    public Mailer body(String body) {
        System.out.println(body);
        return this;
    }
    public void send() {
        System.out.println("Sending ...");
    }
}

class JavaMailer {
    public JavaMailer from(String from) {
        System.out.println(from);
        return this;
    }
    public JavaMailer to(String to) {
        System.out.println(to);
        return this;
    }
    public JavaMailer subject(String subject) {
        System.out.println(subject);
        return this;
    }
    public JavaMailer body(String body) {
        System.out.println(body);
        return this;
    }
    public static void send(Consumer<JavaMailer> consumer) {
        JavaMailer javaMailer = new JavaMailer();

        consumer.accept(javaMailer);
        System.out.println("Sending ...");
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        Mailer mailer = new Mailer();
        mailer.from("istvan@joe.com").to("joe@miro.com").subject("Your code sucks").body("Details").send();

        JavaMailer.send(x -> x.
                from("lambda@function.com")
                .to("consumer@function.com")
                .subject("Your code is good")
                .body("Details"));
    }
}
