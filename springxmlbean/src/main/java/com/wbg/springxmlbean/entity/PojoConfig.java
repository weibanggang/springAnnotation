//包名要和POJO保持一致
package com.wbg.springxmlbean.entity;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan 代表进行扫描，默认是扫描当前包的路径，POJO的包名和它保持一致才能扫描，否则是没有的
 */
@ComponentScan
public class PojoConfig {
}
