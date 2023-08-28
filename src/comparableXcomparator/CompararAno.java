package comparableXcomparator;

import java.util.Comparator;

//Uma classe 'CompararAno' que implementa COMPARATOR
class CompararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2){
        return Integer.compare(l1.getAno(), l2.getAno());
        /*if(l1.getAno() < l2.getAno()){
            return -1;
        } else if (l1.getAno() > l2.getAno()) {
            return 1;
        }else {
            return 0;
        }
        */
    }

}
