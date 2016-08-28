package com.lianyitech.spittr.data;

import java.util.List;

/**
 * Created by daniyyel on 8/24/16.
 */

@
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
