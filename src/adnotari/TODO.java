package adnotari;

public @interface TODO {
    int prioritate();
    int durataH();
    String status() default "todo";
}
