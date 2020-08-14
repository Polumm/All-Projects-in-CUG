# :thought_balloon:Comprehensive Practice of Software Engineering

����������ۺ�ʵϰ�У�������Ҫ����

- ʹ��Scrum���ݿ���
- ȷ��С���Ա��ɫ����(��Ʒ�����ˣ��ŶӸ����ˣ������Ŷ�)
- ʹ��TAPD(Tencent Agile Product Development)��Ѷ���ݲ�Ʒ�з�ƽ̨(www.tapd.cn)�����ȫ�������ڹ���
- ʹ��github��Ϊ�����й�ƽ̨
- ʹ�ÿ��岼�����񣬽���ÿ�ս���վ�����飬���ۺ��ܽ�ÿ�������
- ��Ŀ�ֳ����ε������ֱ�Ϊ
  - ����1���Ŷ��齨��ǰ�ڵ��У�����׼��
  - ����2���������ع�
  - ����3�����������ع�
- ʹ��Jenkins���ɹ���������Ҫ��
  - ʹ��pytest�Զ�����
  - ʹ��SonarQube���д�����������
  - ~~ʹ��Ansible�Զ�����~~(δ��ʵ��)



In this *Comprehensive Practice of Software Engineering*, we need to

- Using Scrum as the method of an agile development process
- Team members grouping as *Product Owner*, *Scrum Master*, *Dev Team*
- Using *TAPD*(Tencent Agile Product Development), a SCRUM platform developed by Tencent, to complete the lifecycle management of the project
- Using *Github* as code hosting platform
- Using board to set mission, using daily stand-up meetings for retrospect
-  Have three Iteration 
  - Iteration ONE��team-creation�� pre-research��technological preparations
  - Iteration TWO��develop and review
  - Iteration Three��requirements changes and code restructure
- Using *Jenkins* as continuous integration tool 
  - Using pytest as automated tests
  - Using SonarQube to check the rule of code
  - ~~Using Ansible to publish automaticly~~ (automatic)



## ��������ʲô(What do we wanna do)

����׫��ϵͳ����Ҫ������ϵͳ���뷨��Դ�����Ż�����ڿ������У����ֺܶ��˶����Լ���Ҫ��������ӣ����Ǵ�����ҵ���ܻ�������ԭ�򣬺ܶ����ӵ�������Դ�����Ϻ��١���һ�ַ����ǿ����Լ����ף��������ַ���ֻ�������ָкõ��ˡ����������ָв��õģ�ֻ��һ�����Գ���ȷ�����ɣ��ǳ���ʱ�䡣������ܲ���������ôһ��ϵͳ���������û��ϴ������ļ����Զ��õ����ӣ������ظ��û���

We want to make a system which could translate a song to it's musical notation. The idea come from my community activities. When I was in the Harmonica club of my collage, I found many people want to paly their favorite songs by harmonica, but maybe because it is a trade secret or some other reasons, the musical notation tends to be hard to seach in the Internet. Of course we could do it by ourself if our musicality is strong enough. But person like me who is not good at it have to try to get the correct note from keep trying, It always spend a lot of time. So I thought weather I could make such a system which could translate a song into notation in a easy way.  What should a user do is just upload music files and wait for the results.

## ����Ҫ���յļ���(The technology we need to use)

- ǰ�� (Front-end)
  - HTML
  - CSS
  - JSP
- ��� (Back-end)
  - Django
  - SQLite
- ���� (Test)
  - pytest
  - Jmeter
- ����������� (Code quality inspection)
  - SonarQube
- ����Ҫ�õ��� (Other dependencs)
  - [Music21](http://web.mit.edu/music21/) (For make music)
  - [Pytorch](https://pytorch.org/) (For recurrent neural network)
  - [librosa](https://librosa.org/doc/latest/index.html) (For music analysis)
  - [MuseScore](https://musescore.org/) (For make musical notation)
  - Java (For convert mid to wav)

## һЩͼ��(Some Graph)

![image-20200814225840968](pics/image-20200814225840968.png)

<center>High level view</center>

![image-20200814105159313](pics/image-20200814105159313.png)

![image-20200814115328682](pics/image-20200814115328682.png)

<center>Activity diagram</center>

![image-20200814115808337](pics/image-20200814115808337.png)

<center>Use case diagram</center>

![����·��](pics/����·��.png)

<center>technical routes</center>

![image-20200814120047240](pics/image-20200814120047240.png)

<center>Development routes</center>

![image-20200814120752595](pics/image-20200814120752595.png)



## ��������(Development process)

![image-20200814122055513](pics/image-20200814122055513.png)

<center>Number of meeting per day</center>

![image-20200814122243027](pics/image-20200814122243027.png)

<center>Functional Requirement Analysis</center>

![image-20200814122334744](pics/image-20200814122334744.png)

<center>Tools deployment</center>

![image-20200814123321209](pics/image-20200814123321209.png)

![image-20200814123343988](pics/image-20200814123343988.png)

<center>Backlog & Board</center>

![image-20200814123454318](pics/image-20200814123454318.png)

<center>Different Iteration</center>

![image-20200814123753975](pics/image-20200814123753975.png)

<center>Gantt Chart</center>

![image-20200814123947866](pics/image-20200814123947866.png)

![image-20200814123933882](pics/image-20200814123933882.png)

<center>Code Submission Trend (from webhook of GitHub)</center>

![image-20200814124145339](pics/image-20200814124145339.png)

![image-20200814124212206](pics/image-20200814124212206.png)

![image-20200814124221713](pics/image-20200814124221713.png)

![image-20200814124352335](pics/image-20200814124352335.png)

<center>Test Moudle</center>



![image-20200814124527890](pics/image-20200814124527890.png)

![image-20200814124329424](pics/image-20200814124329424.png)

<center>Pipe Line In Jenkins & TAPD</center>

![image-20200814124657141](pics/image-20200814124657141.png)

![image-20200814124726264](pics/image-20200814124726264.png)

<center>Release plan with Burn Down chart</center>

![image-20200814130348078](pics/image-20200814130348078.png)

![image-20200814130238918](pics/image-20200814130238918.png)

<center>Code quality inspection by SonarQube</center>



## �ɹ�չʾ(The Accomplishment)

![image-20200814130747556](pics/image-20200814130747556.png)

<center>Home Page</center>

![image-20200814130842270](pics/image-20200814130842270.png)

<center>Online Metronome</center>

![image-20200814134653406](pics/image-20200814134653406.png)

<center>Online Piano</center>

![image-20200814134803469](pics/image-20200814134803469.png)

<center>Generate Notation</center>

![image-20200814214013305](pics/image-20200814214013305.png)

<center>User Homepage</center>

![image-20200814214031712](pics/image-20200814214031712.png)

<center>Upload wav for convert</center>



## ����ֿ�Ͳ��� (Repositories and Bolgs)

### ����ֿ� (Repositories )

��˲ֿ� (back-end) 

https://github.com/UncoDong/back-end

ǰ�˲ֿ� (front-end)

https://github.com/Asa-kura/note

�㷨�ֿ� (neutral network)

https://github.com/UncoDong/Music-Attention-pytorch-onlycode

���Բֿ� (test)

https://github.com/UncoDong/TAPD-test

### ���� (Bolgs)

TAPD����Jenkins (Using Jenkins in TAPD)

https://blog.csdn.net/weixin_42763696/article/details/106412881

Tapd GitHub���� ��ϸͼƬ (How to connect TAPD with Github)

https://blog.csdn.net/weixin_42763696/article/details/106332665

TAPD pytest�Զ������Բ��� (git or ����) (TAPD How to automatically test through pytest)

https://blog.csdn.net/weixin_42763696/article/details/106413263

�����Ʒ����� CentOS 7 Tomcat + Jenkins+���ھ��� ���� (Tomcat+Jenkins+Mirror Srouces Published on ECS's Centos 7)

https://blog.csdn.net/weixin_42763696/article/details/106081449

ǰ��ѧϰ HTML�����﷨ ��ǩ ��д�淶 ���� (Learning notes of HTML)

https://blog.csdn.net/ym912305103/article/details/106700143

ǰ��ѧϰ�ʼ� CSS�������� ��ʽ ��д�淶 (Learning notes of CSS)

https://blog.csdn.net/ym912305103/article/details/106700035

ǰ��ѧϰ HTML5��CSS3������ �߼����� JavaScript�����﷨  (Learning notes of JavaScript)

https://blog.csdn.net/ym912305103/article/details/106700300
