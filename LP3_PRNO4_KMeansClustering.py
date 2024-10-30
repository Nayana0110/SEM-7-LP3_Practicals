#!/usr/bin/env python
# coding: utf-8

# In[2]:


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.cluster import KMeans
import warnings
warnings.filterwarnings('ignore')


# In[7]:


df = pd.read_csv("C:\\Users\\nayan\\Downloads\\sales_data_sample.csv", encoding ='latin')
df


# In[8]:


df.dtypes


# In[9]:


X = df.iloc[:,[3,4]].values


# In[10]:


wcss = []

for i in range(1,11):
    kmeans = KMeans(n_clusters=i, init="k-means++", random_state=42)
    kmeans.fit(X)
    wcss.append(kmeans.inertia_)

    
ks = [1,2,3,4,5,6,7,8,9,10]
plt.plot(ks, wcss, 'bx-')
plt.title("Elbow method")
plt.xlabel("K value")
plt.ylabel("WCSS")


# In[11]:


df.describe()


# In[ ]:




