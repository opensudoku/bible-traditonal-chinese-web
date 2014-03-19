/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mark
 */
package com.opensuodku.bible.books;


/**
 * Focus on English and Chinese Bible
 * English Bible
 * @author mark
 */
public abstract class AbstractBible {
    
   // public abstract String getTestament(int book);
    
    
//    public abstract 
    
    /**
     * Returns book count.
     * @return 
     */
//    public abstract int getCount();
      
    
    /**
     * Returns entire book content
     * @param book from 1 to 66
     * @return 
     */
    public abstract String[][] getBook(int book);
    
    /**
     * Returns one chapter content 
     * @param book
     * @param chapter
     * @return 
     */
    public abstract String[] getChapter(int book, int chapter);
    /**
     * Returns one verse content
     * @param book from 1 to 66
     * @param chapter chapter number per book
     * @param verse verse number per chapter
     * @return 
     */
    public abstract String getVerse(int book, int chapter, int verse);
    
}
