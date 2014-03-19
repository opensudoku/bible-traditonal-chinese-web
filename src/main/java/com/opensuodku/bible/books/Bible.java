/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensuodku.bible.books;

/**
 *
 * @author mark
 */
public class Bible extends AbstractBible implements BibleData, Title {

    @Override
    public String[][] getBook(int book) {
        return BOOK[book];
    }

    @Override
    public String[] getChapter(int book, int chapter) {
        return BOOK[book][chapter];
    }

    @Override
    public String getVerse(int book, int chapter, int verse) {
        return BOOK[book][chapter][verse];
    }

    /**
     * Return selected verse with additional book and chapter info option
     * @param book
     * @param chapter
     * @param verse
     * @param opt 
     * @return 
     */
    public String getVerse(int book, int chapter, int verse, int opt) {
        if (opt == 1) {
            return chapter + ":" + verse + " " + BOOK[book][chapter][verse];
        }
        if (opt == 2) {
            return TITLE_SHORT_TW[book] + " " + chapter + ":" + verse + " " + BOOK[book][chapter][verse];
        }
        if (opt == 3) {
            return "(" + book + ")" + TITLE_SHORT_TW[book] + " " + chapter + ":" + verse + " " + BOOK[book][chapter][verse];
        }

        return getVerse(book, chapter, verse);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public int getCount() {
//        return BOOK.length;
//    }

}
