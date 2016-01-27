/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package JIRC.core;




public  class Contact {

    protected String name, ip;
    
    
    public Contact(String n, String i) {
        name = n;
        ip = i;
    }
    
    public Contact(Contact c) {
        name = c.name;
        ip = c.ip;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setIp(String i){
        ip = i;
    }

    public Contact(String n) {
        name = n;
        ip = null;
    }

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }
    
    
    
}
