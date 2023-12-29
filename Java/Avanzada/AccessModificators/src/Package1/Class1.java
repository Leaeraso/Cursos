package Package1;

class Class1 {
    private String privateAttribute = "Private attribute value";
    
    private Class1(){
        System.out.println("Private Constructor");
    }
    
    public Class1(String arg){
        this();
        System.out.println("Public Constructor");
    }

    public String getPrivateAttribute() {
        return privateAttribute;
    }

    public void setPrivateAttribute(String privateAttribute) {
        this.privateAttribute = privateAttribute;
    }
    
    private void privateMethod(){
        System.out.println("Private Method");
    }
}
