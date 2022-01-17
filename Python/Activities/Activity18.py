import pandas as pd
	
getDataframe = pd.read_csv("C:\\Users\\001YLY744\\PythonTraining_FST\\testPanas.csv")

print("Usernames: "+getDataframe['Usernames'])
print("Password: "+getDataframe['Passwords'])

print("Data sorted in ascending Usernames:")
print(getDataframe.sort_values('Usernames'))
 
print("Data sorted in descending Passwords:")
print(getDataframe.sort_values('Passwords', ascending=False))