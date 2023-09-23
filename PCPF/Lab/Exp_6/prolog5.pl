% WAP to create the following knowledge base loves(vincent,mia). loves(marsellus,mia).
% loves(pumpkin,honey_bunny). loves(honey_bunny,pumpkin). jealous(X,Y):- loves(X,Z),
% loves(Y,Z). Also generate five different queries to get results

% Author - Ajaykumar Nadar

loves(vincent, mia).
loves(marsellus, mia).
loves(pumpkin, honey_bunny).
loves(honey_bunny, pumpkin).
jealous(X,Y):- loves(X,Z), loves(Y,Z).
