package com.buanangelica.gelcasandroidprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    //this is the one that we called first to determine how many items our adapter will be dealing with.
    @Override
    public int getItemCount() {
        return projects.length;
    }

    //called when the adapter needs to create a new ProjectViewHolder object.
    // It inflates a layout file called item_project.xml, which contains the views that will be displayed for each item in the list.
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent,false);
        return new ProjectViewHolder(view);
    }

    //  called when a ProjectViewHolder object is recycled and needs to be updated with new data.
    //  It takes the current position in the list and uses that to retrieve the corresponding Project object from the projects array.
    //  It then calls the bind method on the ProjectViewHolder object, passing in the Project object, to update the views with the new data.
    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        // we give it an individual project, and we do that by calling the Project array
        holder.bind(projects[position]);
    }



    //holds references to the views that will be displayed for each item in the list.
    static class ProjectViewHolder extends RecyclerView.ViewHolder{
   private ImageView appImage;
    private TextView appTitle;
    private TextView appDescription;
        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_project_Title);
            appDescription = itemView.findViewById(R.id.text_view_project_description);
        }

        //recycling and setting all of the views and widgets
        public void bind(Project project){
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);

        }
    }

}
