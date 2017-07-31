package library.database;

import java.util.List;

public class DatabaseKit {
        /**
         * 是否存在数据
         * 
         * @param list
         * @return true:存有数据;false:没有数据。
         */
        public static boolean hasData(List<?> list) {
                if (null == list) {
                        return false;
                }
                if (0 >= list.size()) {
                        return false;
                }
                return true;
        }
}