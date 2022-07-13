package lesson18;

public class StringBuilderTest {

    public static boolean printParametersEquality(StringBuilder arg1, StringBuilder arg2) {
//        if (arg1 == arg2) { завжди буде false, бо це два різних обєкта і вони ссилаються на різну адресу, також так
//                            буде з equals, він працює як ==, не так як в класі String
//            return true;
//        } else
//            return false;
//    }
        if (arg1.equals(arg2)) {
            return true; // true буде тільки в тому випадку, якщо обєкт StringBuilder зрівнювати самим з собою
        } else ;
        return false;
    }
}
