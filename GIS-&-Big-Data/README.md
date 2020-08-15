# :world_map: Geographical Information System & Big Data

������Ϣϵͳ�ʹ����ݶ���ͬһ����ʦ�̵ģ�����ҹ�����һ���ˡ�����λ��ʦ�Ŀ�����ѧ���˺ܶ����ݴ����֪ʶ������ʵϰ�����Ǵ����ݻ�ȡ�������������ӻ��������̶�Ҫ��һ�顣��Ҳ����ջ����࣬Ҳ�ܸ�л��λ��ʦ��

��Ȼ�����ҵ�������ʦ�������ṩ�˺ܶ������������ʦ�Ҷ��ܸм������:bow:

As Geographical Information System and Big Data was taught by the same teacher, so I put them in one folder. I have learned many knowledge about data processing in his class, and his objects always could train our abilities from data collection, data processing and data visualization. So I appreciate this teacher since learn a lot from him.

Of Course! All My Teachers Have Give me Many Both Academic Help And Life Experiences! I Appreciate ALL OF MY TEACHERS Sincerely :bow:!   



�������һ�չʾ������Ŀ��һ���ǳ�����д�֣�һ���������ʷ�����

I will show two projects below, one is *Urban Perception Assessment*, the other is "Green Looking Ratio Calculating"



## :cityscape: Urban Perception Assessment

��һ��ʵ�������ǲο�Ҧ��ʦ�ġ�A human machine adversarial scoring framework for urban perception assessment using street view images�����е�ʵ�顣���ԭ��ʵ���е�����ָ������磬��ʵ�������ǲ��þ��������ķ�ʽ�����н־���֡�

 The first item is a paper from Dr Yao about **urban perception assessment using street-view images**,instead of the RCN in the initial paper,  we used CNN to give score for street-view images.

###  :camera:Data Collection

�ڽ־��ɼ����֣���������һ����׿�ֻ�APP�������Ͻ�¼����Ƶ���ɼ��־���¼����Ƶ��ͬʱ�������GPS������������γ�������ʱ�����¼��csv�ļ��У��������Ƶ����ȡͼƬ����Ϊ���ӻ���׼����

In this part, I made a Android app to collection street view from the lane. The app would also use mobile phone's GPS to save Latitude and longitude into a csv file with timestamp. So we could easily slice images from the video, and the location could also used as a prepare for the visualization.

![image-20200815112813388](pics/image-20200815112813388.png)

<center>The UI of App</center>

![image-20200815112400985](pics/image-20200815112400985.png)

![image-20200815112915651](pics/image-20200815112915651.png)

<center>Files Saving</center>

![image-20200815113530871](pics/image-20200815113530871.png)

<center>CSV File with Loaction</center>

### :factory:Data Processing

#### Step 1 Extract Street View

![image-20200815113216828](pics/image-20200815113216828.png)



����ʹ��python���н־���ȡ��������Ƶ�д��ڲ��ֱ������ڵ��Ĳ��֣���˻������˲ü���Ϊ������ѵ���������ǻ��÷�ת����С�Ŵ�ķ�ʽ������ͼƬ����ѵ������������ģ�͸���³����

We used python to get street views from the video. As there were some internal parts of cars in the images, so we should cut them off. To enlarge the training set, we also useed mirror flipping and inclining resolution to process the data, in order to make the model more robust.



### Step 2 Training set Construction

![image-20200815114510136](pics/image-20200815114510136.png)

���ǽ�ͼƬ��RGBA�����RGB��ͨ��������pickle����ȫ��ͼƬ���ݡ�ͼƬ��1390�ţ���x��Ϊ300x400��

We converted the image from RGBA to RGB, so it changed into 3 channels. And then we use pickle to save all the data. We have 1390 pics, and all of them have same height and weight as 300x400. 

### Step 3 Neural Network (CNN)

![image-20200815114738541](pics/image-20200815114738541.png)

�������ϵĲ��ͣ����ǹ����������������硣���˺ܶ�3x3�ľ��������ȡ�������Լ���2x2�ĳػ����Сά�ȡ�

According the blogs from the Internet, we built a 3 layers convolution neutral network. We used a lot of convolution kernel to extract features and some 2x2 pooling layers to decrease the shape.



## :rainbow:Data Visualization

![image-20200815120146189](pics/image-20200815120146189.png)

��������ݿ��ӻ����֣���������ʹ�������Ͻ���Ŀ��ӻ����[Antv](https://antv.vision/)�����е�ͼ���ӻ���ʹ��python��web.py���������������������񷢲���ȥ��

Finally was the data visualization, we used a visualization frame called [Antv](https://antv.vision/), developed by ANT FINANCIAL SERVICES GROUP. Web.py is a web package in python, we chose it to develop our service.

![image-20200815122925695](pics/image-20200815122925695.png)

<center>Home Page</center>

![image-20200815123004676](pics/image-20200815123004676.png)

<center>Bar Chart</center>

![image-20200815123054501](pics/image-20200815123054501.png)

<center>Heat Map</center>

![image-20200815123139088](pics/image-20200815123139088.png)

<center>The Loss Line chart</center>

## :evergreen_tree: Green Looking Ratio Calculating

�����ʼ����Ǵ����ݿγ̵�һ����ҵ�����ڲο���������ĺ��˽��������ʼ���ķ���������ʵ�����һ���GitHub���ҵ���[��Դ��FCN����](https://github.com/lsh1994/keras-segmentation)��ʹ�õ�ѵ�����ݼ���[CamVid](https://github.com/alexgkendall/SegNet-Tutorial/tree/master/CamVid)��

Green Looking Ratio Calculating is a final project in Big Data Course. I have read many papers to understand how to calculate Green Looking Ratio and what can we do through this result. In addition, I used the open source code of [FCN](https://github.com/lsh1994/keras-segmentation) in GitHub, and the training set I choosing was  [CamVid](https://github.com/alexgkendall/SegNet-Tutorial/tree/master/CamVid).

![image-20200815164909908](pics/image-20200815164909908.png)

<center>Technical Routes</center>

###  :snail:Data Collection

�������õ���[Fiddler](https://www.telerik.com/fiddler)���߽��е�������ȡ����Fiddler������ָ����ַ����������ͨ���ֶ�����־���ͼ�ķ�ʽ����ȡ�־���id��Ϣ��Ȼ��ʹ��[��Ѷ������ƽ̨](https://lbs.qq.com/panostatic_v1/index.html)��λ�÷����API������ȡ�õصĽ־���

In this project I used [Fiddler](https://www.telerik.com/fiddler) to collect the street view images. After setting a filter which will select message from appointed host name, you can just click the street view map to get the id of pictures. The [Tencent Developer Platform](https://lbs.qq.com/panostatic_v1/index.html) could offer service of *Static Street View API*, you can just apply for a key to use it.

![image-20200815162845105](pics/image-20200815162845105.png)

<center>Crawling Images</center>

![image-20200815163112760](pics/image-20200815163112760.png)

<center>Saved Message</center>



### :factory:Data Processing

#### Step 1 Significant Feature Extraction

[��������Ѷ�־��ĳ�������Ҫ��������������Ӿ����ۡ�](http://cdmd.cnki.com.cn/Article/CDMD-10270-1019099544.htm)���ᵽ��һ�ֹ۵���������Ĺ۵㣬���� [Exploiting Surroundedness for Saliency Detection: A Boolean Map Approach](https://ieeexplore.ieee.org/document/7226835#:~:text=Exploiting%20Surroundedness%20for%20Saliency%20Detection%253A%20A%20Boolean%20Map,proposing%20a%20Boolean%20Map%20based%20Saliency%20model%20(BMS).)�ڵĹ�ʽ��������������㡣����Ĺ�ʽ�ͽ��������ʾ������$x$��ͼ����ÿ���������λ�ã�$c$��ʾ����ͼ�����ĵ������λ�ã�$\sigma$��һ�����������
$$
S_p=exp(- \frac{||x-c||)^2}{\sigma^2})
$$


![image-20200815174200445](pics/image-20200815174200445.png)

In paper [��������Ѷ�־��ĳ�������Ҫ��������������Ӿ����ۡ�](http://cdmd.cnki.com.cn/Article/CDMD-10270-1019099544.htm) I found a view about the Significant Feature��the calculating function came from  [Exploiting Surroundedness for Saliency Detection: A Boolean Map Approach](https://ieeexplore.ieee.org/document/7226835#:~:text=Exploiting%20Surroundedness%20for%20Saliency%20Detection%253A%20A%20Boolean%20Map,proposing%20a%20Boolean%20Map%20based%20Saliency%20model%20(BMS).) . The formula and the results are just as the below. $x$ is the position of each pixels, ��$c$is the centre point of the image��$\sigma$ is a parameter set by us.

#### Step 2 Neural Network

U-Net�����ڳ���������ָ�������֮һ��ѵ�����ݼ�������CamVid��ѵ��������¡�

U-Net is one of the most common FCN algorithm. As the training set come from CamVid, the result is just like below.

![image-20200815174710769](pics/image-20200815174710769.png)

![image-20200815175028695](pics/image-20200815175028695.png)



### Step 3 Calculate Green Looking Ratio

���������������۸������ʱ����û�о�ȷ����־����㷨���֣���˼�������������Ϣ��Ϊģ�������������������ܹ����Ӿ�׼�ؽ�������ָ����ҶԹ�ʽ�����˸Ľ���ԭ���Ĺ�ʽ��(1)���Ҹ��ĳ���(2)��ԭ��������[��ľꖶ�](https://researchmap.jp/read0003752)������ǽֵ��ĳ��Ⱥͽ����ĸ߶���ý����������ֲ���Ҳ�ǽ��Ƴ����ġ��������е���������Ը��ӵľ�ȷ��������ʹ�� ��ֲ��ȷ���/(�ֵ���� +�������)����������������Ӿ�ȷ����������ȱ�ٶԱ�ʵ�飬�д���ȶ��

As there was no accurate algorithm to segment the objects of images,  the old formula is not fitting now. With the more precise FCN, I changed the equation from (1) to (2). In the initial, the author,[Yoji Aoki](https://researchmap.jp/read0003752),  used the multiplication of length of the streets and the average height of buildings. Now with the more accuracy FCN algorithm, I use the exact area of street and buildings to make plus, and of course the green plants area come from the significant feature. It **should** be better then the  past function, but to be honest, the new one haven't be compared with the old one. So it still need experiments to confirm.
$$
GLR_{old} = \frac{Green \ Area(S)}{(Street\ Length(L)*Average\ Building\ Height(H) )}*100\%       \tag{1}
$$

$$
GLR_{new} = \frac{S_p\ Green \ Area(S_{plant})}{(Street\ Area(S_{building})+Building\ Area(S_{street}) )}*100\%       \tag{2}
$$


## :rainbow:Data Visualization

![image-20200815192815714](pics/image-20200815192815714.png)

![image-20200815192830574](pics/image-20200815192830574.png)



