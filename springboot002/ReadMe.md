配置文件的加载顺序
springboot启动会扫描以下位置的application.properties或者application.yml文件作为Springboot的默认配置
文件
- file:./config/
- file:./
- classpath:/config/
- classpath:/
优先级由高到底，高优先级的配置会覆盖低优先级的配置；
Springboot会从这四个位置全部加载主配置文件；互补配置