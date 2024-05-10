

# Data Science and Big Data Analytics Practicals

## Introduction

Welcome to the Data Science and Big Data Analytics practicals! This series of exercises is designed to provide hands-on experience with various data wrangling, descriptive statistics, data analytics, and data visualization techniques using Python and/or R. Each practical focuses on a specific aspect of data analysis and includes detailed instructions, code snippets, and explanations.


### Libraries Used

1. **pandas**:
   - **Description**: pandas is a powerful Python library used for data manipulation and analysis. It provides data structures like DataFrame and Series, which are efficient for handling structured data.
   - **Key Features**:
     - Data manipulation: DataFrame provides methods for data selection, filtering, aggregation, and transformation.
     - Missing data handling: pandas offers functions for detecting and handling missing data, such as `isnull()` and `fillna()`.
     - Data I/O: It supports reading and writing data from various file formats like CSV, Excel, SQL databases, and JSON.
   - **Website**: [pandas Documentation](https://pandas.pydata.org/docs/)

2. **numpy**:
   - **Description**: numpy is a fundamental package for scientific computing in Python. It provides support for large, multi-dimensional arrays and matrices, along with a collection of mathematical functions to operate on these arrays.
   - **Key Features**:
     - Multi-dimensional array manipulation: numpy arrays are efficient for numerical operations and can be indexed, sliced, and reshaped easily.
     - Mathematical functions: numpy provides a wide range of mathematical functions for array manipulation, linear algebra, random number generation, and Fourier transforms.
     - Integration with other libraries: numpy arrays are compatible with pandas, matplotlib, and other scientific computing libraries in Python.
   - **Website**: [NumPy Documentation](https://numpy.org/doc/)

3. **scikit-learn**:
   - **Description**: scikit-learn is a versatile Python library for machine learning tasks such as classification, regression, clustering, and dimensionality reduction. It provides simple and efficient tools for data mining and data analysis.
   - **Key Features**:
     - Consistent API: scikit-learn offers a unified interface for various machine learning algorithms, making it easy to experiment with different models.
     - Model evaluation: It provides functions for model evaluation, including metrics for classification, regression, and clustering tasks.
     - Preprocessing and feature engineering: scikit-learn includes modules for data preprocessing, feature selection, and feature scaling.
   - **Website**: [scikit-learn Documentation](https://scikit-learn.org/stable/documentation.html)

4. **matplotlib**:
   - **Description**: matplotlib is a comprehensive library for creating static, animated, and interactive visualizations in Python. It provides a MATLAB-like interface for creating plots and charts.
   - **Key Features**:
     - Plotting functions: matplotlib offers a wide range of plotting functions for creating line plots, scatter plots, bar charts, histograms, and more.
     - Customization: It provides extensive customization options for controlling plot styles, colors, labels, and annotations.
     - Multiple output formats: matplotlib can generate plots in various formats, including PNG, PDF, SVG, and interactive formats for web applications.
   - **Website**: [Matplotlib Documentation](https://matplotlib.org/stable/contents.html)

5. **seaborn**:
   - **Description**: seaborn is a Python visualization library based on matplotlib. It provides a high-level interface for creating informative and attractive statistical graphics.
   - **Key Features**:
     - Statistical plots: seaborn offers specialized functions for creating informative statistical plots such as scatter plots, box plots, violin plots, and pair plots.
     - Integration with pandas: seaborn seamlessly integrates with pandas DataFrames, making it easy to visualize data directly from pandas objects.
     - Styling and theming: It provides built-in themes and color palettes for enhancing the aesthetics of plots.
   - **Website**: [Seaborn Documentation](https://seaborn.pydata.org/tutorial.html)

6. **nltk**:
   - **Description**: NLTK (Natural Language Toolkit) is a leading platform for building Python programs to work with human language data. It provides easy-to-use interfaces to over 50 corpora and lexical resources, along with a suite of text processing libraries for classification, tokenization, stemming, tagging, parsing, and semantic reasoning.
   - **Key Features**:
     - Text processing: NLTK offers tools for text tokenization, part-of-speech tagging, named entity recognition, and sentiment analysis.
     - Corpora and resources: It includes a diverse collection of text corpora and lexical resources for various languages and domains.
     - Learning algorithms: NLTK provides implementations of popular machine learning algorithms for text classification, clustering, and information retrieval.
   - **Website**: [NLTK Documentation](https://www.nltk.org/)

---


## 1. Data Wrangling I

### Objective:
Perform data wrangling operations on an open-source dataset.

### Steps:
1. **Import Libraries**: Begin by importing the required Python libraries for data analysis.
2. **Data Source**: Locate an open-source dataset from a reputable platform such as Kaggle. Provide a clear description of the dataset and its source URL.
3. **Data Loading**: Load the dataset into a pandas DataFrame.
4. **Data Preprocessing**: Check for missing values using `isnull()` and generate initial statistics using `describe()`. Provide variable descriptions and check the dimensions of the DataFrame.
5. **Data Formatting and Normalization**: Summarize variable types and apply proper type conversions. Convert categorical variables into quantitative ones.



## 2. Data Wrangling II

### Objective:
Create an "Academic Performance" dataset of students and perform data cleaning and transformation operations.

### Steps:
1. **Missing Values and Inconsistencies**: Scan all variables for missing values and inconsistencies. Use suitable techniques to handle them.
2. **Outlier Detection**: Scan numeric variables for outliers and apply appropriate techniques to deal with them.
3. **Data Transformations**: Apply transformations on at least one variable to address issues such as scale change, linearization, or skewness reduction.


## 3. Descriptive Statistics - Measures of Central Tendency and Variability

### Objective:
Perform descriptive statistics operations on an open-source dataset.

### Steps:
1. **Summary Statistics**: Provide summary statistics (mean, median, minimum, maximum, standard deviation) for a dataset with numeric variables grouped by a categorical variable.
2. **Statistical Details**: Write a Python program to display basic statistical details like percentile, mean, and standard deviation for specific categories in the dataset.



## 4. Data Analytics I: Linear Regression Model

### Objective:
Create a Linear Regression Model to predict home prices using the Boston Housing Dataset.

### Steps:
1. **Dataset Description**: Introduce the Boston Housing Dataset and its features.
2. **Model Creation**: Implement a Linear Regression Model using Python or R.
3. **Evaluation**: Evaluate the model's performance and discuss its predictive capabilities.



## 5. Data Analytics II: Logistic Regression

### Objective:
Implement logistic regression for classification tasks using Python or R.

### Steps:
1. **Dataset Description**: Introduce the Social Network Ads Dataset and its features.
2. **Model Training**: Implement logistic regression for binary classification.
3. **Evaluation Metrics**: Compute confusion matrix and relevant metrics such as accuracy, precision, recall, and F1-score.


---

## 6. Data Analytics III: Naïve Bayes Classification

### Objective:
Implement Simple Naïve Bayes classification algorithm using Python or R on the Iris dataset.

### Steps:
1. **Dataset Description**: Introduce the Iris Flower dataset and its features.
2. **Model Training**: Implement Naïve Bayes classification algorithm.
3. **Evaluation Metrics**: Compute confusion matrix and relevant metrics such as accuracy, precision, recall, and F1-score.



## 7. Text Analytics

### Objective:
Apply text preprocessing techniques and create document representation using Term Frequency-Inverse Document Frequency (TF-IDF).

### Steps:
1. **Document Preprocessing**: Tokenization, POS Tagging, stop words removal, Stemming, and Lemmatization.
2. **Document Representation**: Calculate TF-IDF scores for each document.



## 8. Data Visualization I

### Objective:
Explore and visualize patterns in the Titanic dataset using Seaborn library.

### Steps:
1. **Dataset Description**: Introduce the Titanic dataset and its features.
2. **Data Exploration**: Visualize patterns using Seaborn library.
3. **Histogram Plot**: Plot a histogram to analyze the distribution of ticket prices.


## 9. Data Visualization II

### Objective:
Visualize the distribution of age with respect to gender and survival status in the Titanic dataset using box plots.

### Steps:
1. **Dataset Description**: Introduce the Titanic dataset and its features.
2. **Box Plot Visualization**: Plot box plots to analyze the distribution of age by gender and survival status.



## 10. Data Visualization III

### Objective:
Visualize feature distributions and identify outliers in the Iris Flower dataset.

### Steps:
1. **Dataset Description**: Introduce the Iris Flower dataset and its features.
2. **Feature Distribution Histograms**: Plot histograms to illustrate feature distributions.
3. **Box Plots**: Plot box plots to compare feature distributions and identify outliers.


---


