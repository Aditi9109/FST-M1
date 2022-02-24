import pandas

# Read data from Excel sheet
df = pandas.read_excel('C:\\Users\\001YLY744\\PythonTraining_FST\\testWrite.xlsx')
print(df)
print("Rows: ", df.count)
print("Cols: ", df.columns)
print("Total nos of rows and columns:", df.shape)
print("Emails:")
print(df['Email'])
print("Sorted data:")
print(df.sort_values('FirstName'))