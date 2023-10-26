package org.apache.shardingsphere.sharding.merge.dql.groupby.aggregation;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * concat aggregation unit.
 */
@RequiredArgsConstructor
public class GroupConcatAggregationUnit implements AggregationUnit {
    
    private final String separator = ",";
    
    private final List<String> result = new ArrayList<>();

    
    @Override
    public void merge(final List<Comparable<?>> values) {
        if (null == values || null == values.get(0)) {
            return;
        }
        result.add(StringUtils.join(values, separator));
    }
    
    @Override
    public Comparable<?> getResult() {
        return StringUtils.join(result, separator);
    }
}
