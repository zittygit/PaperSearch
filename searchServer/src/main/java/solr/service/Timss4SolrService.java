package solr.service;

import solr.bean.QResult;

import java.io.InputStream;
import java.util.Map;

/**
 * @author 890213
 * @version 1.0
 * @date 2017/8/10 15:21
 */

public interface Timss4SolrService {
    QResult query(String keyWord, String site, String type, int start, int rows);

    QResult insert(Map<String, Object> params, InputStream fileStream);

    QResult update(Map<String, Object> params, InputStream fileStream);

    QResult delete(String fileName, String site, String userId);

}
