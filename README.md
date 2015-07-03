# Description
A demo use Fresco to load image and base on Chris Banes' s Android Design library

It seems that not very perfect by loading GIF with progressbar, I think may be after the image downloaded, it needs much time to handle the GIF
 and show it.

SubsamplingScaleImageView appear a problem like this:Bitmap too large to be uploaded into a texture (440x4390, max=4096x4096), If the image is too large.
So I use PooledByteBuffer instead of CloseableImage.

```Java
    bytes = dataSource.getResult();
    PooledByteBuffer pooledByteBuffer = bytes.get();
    PooledByteBufferInputStream sourceIs = new PooledByteBufferInputStream(pooledByteBuffer);
    BufferedInputStream bis = new BufferedInputStream(sourceIs);
    //TODO something
```

The photos is from
<p><a href="http://www.pexels.com/">http://www.pexels.com/</a>

# Screenshots

![image](https://github.com/06peng/FrescoDemo/blob/master/screeshots/device-2015-06-26-160956.png)

![image](https://github.com/06peng/FrescoDemo/blob/master/screeshots/device-2015-06-26-161029.png)

# Open source projects

<p><a href="https://github.com/facebook/fresco">fresco</a>

<p><a href="https://github.com/chrisbanes/cheesesquare">cheesesquare</a>

<p><a href="https://github.com/chrisbanes/PhotoView">PhotoView</a>

<p><a href="https://github.com/davemorrissey/subsampling-scale-image-view">subsampling-scale-image-view</a>

<p><a href="https://github.com/koral--/android-gif-drawable">android-gif-drawable</a>

# License

Copyright 2013 06peng

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.