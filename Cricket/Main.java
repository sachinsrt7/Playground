#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int total_balls,total_runs,run_scored,ball_bowled;
  cin>>total_balls>>total_runs>>run_scored>>ball_bowled;
  int overs=total_balls/6;
  int over_finish=ball_bowled/6;
  int a=ball_bowled%6;
  float over_finished=over_finish+(0.1*a);
  float total_run_rate=(float)total_runs/overs;
  float current_run_rate=(float)run_scored/over_finished;
  cout<<overs<<"\n"<<over_finished<<"\n"<<fixed<<setprecision(1)<<current_run_rate<<"\n"<<fixed<<setprecision(1)<<total_run_rate<<"\n";
  if(current_run_rate>=total_run_rate)
  {
   cout<<"Eligible to Win"; 
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
  return 0;
}