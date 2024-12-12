
class Phone{
public static void voiceCall() {
System.out.println("Voice calling with Phone");
}
}
class SmartPhone extends Phone{
public static void videoCall() {
System.out.println("Video calling with SmartPhone");
}
}
class Communication{
public static void call(Phone p) {
p.voiceCall();
}
public static void call(SmartPhone sm) {
sm.videoCall();
}
}
public class CompileTimePolymorphism {
public static void main(String[] args) {
Phone p1 = new Phone();
SmartPhone sp = new SmartPhone();
Phone p2 = new SmartPhone();

Communication comm = new Communication();
comm.call(p1);
comm.call(sp);
comm.call(p2);
}
}
