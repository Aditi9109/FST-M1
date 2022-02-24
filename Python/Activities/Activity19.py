# Import pandas
import pandas
from pandas import ExcelWriter

df = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe = pandas.DataFrame(df)
print(dataframe)
writer = ExcelWriter('C:\\Users\\001YLY744\\PythonTraining_FST\\testWrite.xlsx')
dataframe.to_excel(writer, 'MySheet', index = False)
writer.save()