package comparableXcomparator;

import java.util.Comparator;

//Uma classe 'CompararAutor' que implementa COMPARATOR
class CompararAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2){
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
