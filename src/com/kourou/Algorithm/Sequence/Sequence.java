package com.kourou.Algorithm.Sequence;

/**
 * @Author： kourou
 * @Data： 2019/10/12 8:48
 * @Description：
 */
public interface Sequence {
    void add(Object data);
    Object remove(int index);
    Object set(int index,Object newData);
    Object get(int index);
    boolean contains(Object data);
    int size();
    Object[] toArray();
    void clean();
}
