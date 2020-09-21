class PhoneWX extends Phone
{
    // additional member
    private String extension;

    // public static constants
    public static final String DEFAULT_EXT  = "00";
    public static final int VALID_EXT_LEN = 2;

    // constructors
    public PhoneWX()
    {
        super();
        extension = DEFAULT_EXT;
    }
    public PhoneWX(String ac, String num, String ext)
    {
        // first, base class stuff
        super(ac, num);

        // now the extension
        if ( !setExt(ext) )
            extension = DEFAULT_EXT;
    }

    // mutators
    public boolean setExt(String ext)
    {
        // first base class stuff
        if ( !validExt(ext) )
            return false;  // don't change anything, return false
        extension = ext;
        return true;
    }

    public boolean setAll(String ac, String num, String ext)
    {
        // set only good args.  bad ones don't change member
        boolean retValSetBoth, retValSetExt;

        // first base class stuff (unique call to base)
        retValSetBoth = setBoth(ac, num);

        // now derived member
        retValSetExt = setExt(ext);

        // client gets false if anything was bad.
        return retValSetBoth &&  retValSetExt;
    }

    // accessor
    public String getExt()
    {
        return extension;
    }

    // stringizers
    public String toString()
    {
        return super.toString() + "  ext. " + extension;
    }
    public void showPhone()
    {
        // System.out.println(super.toString() + "  ext: "  + extension );
        // or, easier, just
        System.out.println( toString() );
    }
    public void showPhoneWithoutExtension()
    {
        System.out.println( super.toString() );
    }

    //overridden
    public String dialing()
    {
        String retStr;

        // chain to base class method
        retStr = super.dialing();

        // now add derived data to console
        retStr += "   (" + toString() + ")\n";

        return retStr;
    }

    // overloaded
    public String redialing()
    {
        String retStr;

        // chain to base class method AS OVERLOAD, not OVERRIDE
        retStr = "calling extenson " + toString() + " only once ...\n";
        retStr += redialing(1);  // because of argument, 1, must be base call
        return retStr;
    }

    // helper for vetting extensions numbers  --------------------------
    private static boolean validExt(String s)
    {
        if (isNumber(s) && (s.length() == VALID_EXT_LEN))
            return true;
        return false;
    }
}
