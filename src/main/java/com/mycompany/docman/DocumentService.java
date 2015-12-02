package com.mycompany.docman;
import java.util.List;

public interface DocumentService {

        /**
         * Retrieve all documents in the catalog.
         * @return all documents
         */
        public List findAll();
        
        /**
         * search documents according to keyword in :
         * Выборки Нужны будут
- по типу договора
- по коду компании
- по названию компании
- по номеру договора
- по предмету договора
- по ответственному лицу.
         * @param keyword for search
         * @return list of documents that match the keyword
         */
        public List search(String keyword);
}
