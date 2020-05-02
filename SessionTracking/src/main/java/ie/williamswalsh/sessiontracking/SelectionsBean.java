/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.williamswalsh.sessiontracking;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean( name="selectionsBean")
@SessionScoped
public class SelectionsBean implements Serializable {
    
    private static final HashMap<String, String> booksMap = new HashMap<String, String>();
    
    // Maps topics to books?? TopicsMap? y topicsMap? -> How to name HashMap
    static{
        booksMap.put("java", "Java How to program");
        booksMap.put("cpp", "C++ How to program");
        booksMap.put("android", "Android How to program");
        booksMap.put("csharp", "C# How to program");
    }
    private Set<String> selections = new TreeSet<String>();
    private String selection;
    
    public String getSelection() {
        return selection;
    }
    
    public void setSelection(String topic) {
        // Gets book from topic
        selection = booksMap.get(topic);
        // Adds the book
        selections.add(selection);
    }
    
    public int getNumberOfSelections() {
        return selections.size();
    }
    
    public String[] getSelections(){
        return selections.toArray(new String[selections.size()]);
    }
}
