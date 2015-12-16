/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Projects;

public class Task {

    private String title, description;

    public Task(String t, String d) {
        title = t;
        description = d;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;

    }

    public void setTitle(String t) {
        title = t;
    }

    public void setDescription(String d) {
        description = d;
    }

    public boolean validate() {
        return title != null && description != null && !title.equals("") && !description.equals("");
    }

    @Override
    public String toString() {
        return title + ":\n" + description;
    }

    public String toFile() {
        String temp = title + "%i%";
        temp += description + "%t%";

        return temp;
    }

}
