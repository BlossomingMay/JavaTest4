### 说明
早上提交docker文件缺少了jar包，需要clone项目然后用IDEA 手动package然后复制到docker/app目录下。

下午重新提交jar包上去成功了可以直接下载docker文件夹运行了。我尝试下载了一下，由于jar包比较大不科学上网下载速度有点慢。

切换到docker目录执行build.sh,curl.sh,stop.sh
其中，.sh文件缺少了执行权限，需要

> chmod a+x xxx.sh

由于查询电影数据较多，放在生成的filmresult.txt里，登录成功或者失败会在控制台显示，也可以在huanglog/spring.log目录下查看生成的log文件，
设置了debug级别，会显示执行的sql语句。

SpringBootModel文件是项目的源文件，尝试 IDEA rename项目名称似乎不能修改文件夹的真正名称，由于项目已经做完了就没有在改名字了，
在本地测试实现了几乎全部的规定的功能，除了根据返回的customerId进行下一步操作，由于对shell不够熟悉，id是强制规定一致的，没有通过curl动态获得。

子模块的README.md没写东西，无需阅读。




