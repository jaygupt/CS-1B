public class Foothill
{
    public static void main (String[] args)
    {
        Phone me = new Phone("123", "1234567"),
                you = new Phone();

        System.out.println("\nAfter Constructors:");
        System.out.print("ME ...   \n   ");
        me.showPhone();
        System.out.print("YOU ...   \n   ");
        you.showPhone();

        me.setBoth("408", "99XX9887BAD7");
        you.setBoth("714", "9998877");

        System.out.println("\nAfter setBoth():");
        System.out.print("ME ...   \n   ");
        me.showPhone();
        System.out.print("YOU ...   \n   ");
        you.showPhone();

        if (!me.setAC("719498"))
            me.setAC("818");
        if (!you.setPhNum("5551212"))
            you.setPhNum("9997777");

        System.out.println("\nAfter setAC(), setPhNum():");
        System.out.print("ME ...   \n   ");
        me.showPhone();
        System.out.print("YOU ...   \n   ");
        you.showPhone();

        System.out.println("\nUsing accessors:");
        System.out.println("ME ...\n   "
                + me.getAreaCode() + "   "
                + me.getNumber());
        System.out.println("YOU ...\n   "
                + you.getAreaCode() + "   "
                + you.getNumber());

        System.out.println("\ndialing():");
        System.out.println("ME ...\n   "
                + "   " +  me.dialing());
        System.out.println("YOU ...\n   "
                + "   " +  you.dialing());

        System.out.println("\nredialing():");
        System.out.println("ME ...\n   "
                + "   " +  me.redialing(3));
        System.out.println("YOU ...\n   "
                + "   " +  you.redialing(3));
    }
}